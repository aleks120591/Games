package kr.aleks.games;

public class dataConstr {

    private int mTitle;
    private int mImage;

    public dataConstr(){}

    public dataConstr(int title, int image){
        this.mTitle = title;
        this.mImage = image;
    }

    public int getTitle() {
        return mTitle;
    }

    public int getImage() {
        return mImage;
    }
}
