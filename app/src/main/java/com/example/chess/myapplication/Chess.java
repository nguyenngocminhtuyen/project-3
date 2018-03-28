package com.example.chinesechess;

public class Chess {
    public static final int UNIT = 57;
    private int chessID;
    private int chessID2;
    private int fromX;
    private int fromY;
    private int toX;
    private int toY;
    int score;

    public Chess(int ChessID, int ChessID2, int fromX,int fromY,int toX,int toY){
        this.chessID = ChessID;
        this.chessID2 = ChessID2;
        this.fromX = fromX;
        this.fromY = fromY;
        this.toX = toX;
        this.toY = toY;
    }

    public int getChessID(){
        return chessID;
    }

    public void setChessID(int chessID){
        this.chessID = chessID;
    }

    public int getChessID2(){
        return chessID2;
    }

    public void setChessID2(int chessID2){
        this.chessID2 = chessID2;
    }

    public int getFromX(){
        return this.fromX;
    }

    public void setfromX(int fromX){
        this.fromX = fromX;
    }

    public int getFromY(){
        return this.fromY;
    }

    public void setfromY(int fromY){
        this.fromY = fromY;
    }

    public int getToX(){
        return this.toX;
    }

    public void setToX(int toX){
        this.toX = toX;
    }

    public int getToY(){
        return this.toY;
    }

    public void setToY(int toY){
        this.toY = toY;
    }
}package com.example.chinesechess;

public class Chess {
    public static final int UNIT = 57;
    private int chessID;
    private int chessID2;
    private int fromX;
    private int fromY;
    private int toX;
    private int toY;
    int score;

    public Chess(int ChessID, int ChessID2, int fromX,int fromY,int toX,int toY){//������
        this.chessID = ChessID;
        this.chessID2 = ChessID2;
        this.fromX = fromX;
        this.fromY = fromY;
        this.toX = toX;
        this.toY = toY;
    }

    public int getChessID(){
        return chessID;
    }

    public void setChessID(int chessID){
        this.chessID = chessID;
    }

    public int getChessID2(){
        return chessID2;
    }

    public void setChessID2(int chessID2){
        this.chessID2 = chessID2;
    }

    public int getFromX(){
        return this.fromX;
    }

    public void setfromX(int fromX){
        this.fromX = fromX;
    }

    public int getFromY(){
        return this.fromY;
    }

    public void setfromY(int fromY){
        this.fromY = fromY;
    }

    public int getToX(){
        return this.toX;
    }

    public void setToX(int toX){
        this.toX = toX;
    }

    public int getToY(){
        return this.toY;
    }

    public void setToY(int toY){
        this.toY = toY;
    }
}