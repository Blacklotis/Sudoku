package com.sudoku.csuf.sudoku;


import database.DatabaseAdapter;

/**
 * Created by Mark Ballin on 2/12/2017.
 */
public class Board {

    private long boardID;
    private int boardMoveHistoryLimit;
    private String boardInitialState;
    private String boardCurrentState;
    private String boardLastState;
    private String[] boardMovesList;

    public Board()
    {
        this.boardID = -1;
        this.boardMoveHistoryLimit = 1000;
        this.boardInitialState = "";
        this.boardCurrentState = "";
        this.boardLastState = "";
        this.boardMovesList = new String[boardMoveHistoryLimit];
    }

    public Board(Board newBoard)
    {
        this.boardID = newBoard.getBoardID();
        this.boardMoveHistoryLimit = newBoard.getBoardMoveHistoryLimit();
        this.boardInitialState = newBoard.getBoardInitialState();
        this.boardCurrentState = newBoard.getBoardCurrentState();
        this.boardLastState = newBoard.getBoardLastState();
        this.boardMovesList = new String[boardMoveHistoryLimit];
    }

    public long getBoardID() {
        return boardID;
    }

    public void setBoardID(long boardID) {
        this.boardID = boardID;
    }

    public int getBoardMoveHistoryLimit() {
        return boardMoveHistoryLimit;
    }

    public void setBoardMoveHistoryLimit(int boardMoveHistoryLimit) {
        this.boardMoveHistoryLimit = boardMoveHistoryLimit;
    }

    public String getBoardInitialState() {
        return boardInitialState;
    }

    public void setBoardInitialState(String boardInitialState) {
        this.boardInitialState = boardInitialState;
    }

    public String[] getBoardMovesList() {
        return boardMovesList;
    }

    public void setBoardMovesList(String[] boardMovesList) {
        this.boardMovesList = boardMovesList;
    }

    public String getBoardCurrentState() {
        return boardCurrentState;
    }

    public void setBoardCurrentState(String boardCurrentState) {
        this.boardCurrentState = boardCurrentState;
    }

    public String getBoardLastState() {
        return boardLastState;
    }

    public void setBoardLastState(String boardLastState) {
        this.boardLastState = boardLastState;
    }
}
