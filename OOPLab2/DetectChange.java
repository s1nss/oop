package OOPLab2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DetectChange {
    private List<String> snapshot;
    private List<String> update;

    public DetectChange(List<String> snapshot, List<String> update) {
        this.snapshot = snapshot;
        this.update = update;
    }

    public void detectChanges() {
        Map<String, String> updateMap = createMetadataMap(update);
        Map<String, String> snapshotMap = createMetadataMap(snapshot);

        for (String fileName : updateMap.keySet()) {
            if (!snapshotMap.containsKey(fileName) && !fileName.equals("Unknown")) {
                System.out.println("File '" + fileName + "' was deleted.");
            } else {
                String snapshotMetadata = updateMap.get(fileName);
                String updateMetadata = snapshotMap.get(fileName);
                if (!snapshotMetadata.equals(updateMetadata) && !fileName.equals("Unknown")) {
                    System.out.println("File '" + fileName + "' has changed.");
                }
            }
        }

        for (String fileName : snapshotMap.keySet()) {
            if (!updateMap.containsKey(fileName) && !fileName.equals("Unknown")) {
                System.out.println("File '" + fileName + "' is new.");
            }
        }
    }

    private Map<String, String> createMetadataMap(List<String> metadataList) {
        return metadataList.stream()
                .collect(Collectors.toMap(
                        this::extractFileName,
                        metadata -> metadata,
                        (existing, replacement) -> replacement
                ));
    }

    private String extractFileName(String metadata) {
        String[] parts = metadata.split("\n");
        if (parts.length > 0) {
            return parts[0].replace("File: ", "");
        } else {

            return "Unknown"; // Change this to your desired default value.
        }
    }
}