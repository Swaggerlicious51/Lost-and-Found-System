abstract class Item {
    private String itemID;
    private String description;
    private String dateReported;
    private int daysPassed;

    public Item(String itemID, String description, String dateReported, int daysPassed) {
        this.itemID = itemID;
        this.description = description;
        this.dateReported = dateReported;
        this.daysPassed = daysPassed;
    }

    public abstract void displayItemInfo();

    public void updateDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getItemID() {
        return itemID;
    }

    public String getDescription() {
        return description;
    }

    public String getDateReported() {
        return dateReported;
    }

    public int getDaysPassed() {
        return daysPassed;
    }

    public boolean isOverdue() {
        return daysPassed > 30;
    }
}
