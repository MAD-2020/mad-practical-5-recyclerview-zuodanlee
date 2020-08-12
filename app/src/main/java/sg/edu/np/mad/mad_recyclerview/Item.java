package sg.edu.np.mad.mad_recyclerview;

public class Item {
    private String itemString;
    private boolean isChecked;

    public Item(){

    }

    public Item(String text, boolean checked){
        this.setChecked(checked);
        this.setItemString(text);
    }

    public String getItemString() {
        return itemString;
    }

    public void setItemString(String itemString) {
        this.itemString = itemString;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
