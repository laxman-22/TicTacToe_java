import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToeGUI extends TicTacToe implements ActionListener {
    private JFrame guiWindow;
    private JButton rowOneColumnOne;
    private JButton rowOneColumnTwo;
    private JButton rowOneColumnThree;
    private JButton rowTwoColumnOne;
    private JButton rowTwoColumnTwo;
    private JButton rowTwoColumnThree;
    private JButton rowThreeColumnOne;
    private JButton rowThreeColumnTwo;
    private JButton rowThreeColumnThree;
    
    private JLabel gameProgressLabel;
    private JLabel winsLabel;
    
    private JPanel buttonGridPanel;
    
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem newGame;
    private JMenuItem quitGame;
    
    private String currPlayer;
    private int xWins;
    private int oWins;
    private int ties;
    
    public static void main(String[] args) throws Exception {
        new TicTacToeGUI();
    }

    public TicTacToeGUI() {
        super();
        xWins = 0;
        oWins = 0;
        ties = 0;
        guiWindow = new JFrame();
        guiWindow.setSize(420, 420);
        guiWindow.setResizable(false);
        
        rowOneColumnOne = new JButton();
        rowOneColumnTwo = new JButton();
        rowOneColumnThree = new JButton();
        rowTwoColumnOne = new JButton();
        rowTwoColumnTwo = new JButton();
        rowTwoColumnThree = new JButton();
        rowThreeColumnOne = new JButton();
        rowThreeColumnTwo = new JButton();
        rowThreeColumnThree = new JButton();
        
        buttonGridPanel = new JPanel();
        buttonGridPanel.setLayout(new GridLayout(3, 3));
        
        guiWindow.setLayout(new BoxLayout(guiWindow.getContentPane(), BoxLayout.Y_AXIS));
        
        gameProgressLabel = new JLabel("X's Turn");
        
        rowOneColumnOne.addActionListener(this);
        rowOneColumnTwo.addActionListener(this);
        rowOneColumnThree.addActionListener(this);
        rowTwoColumnOne.addActionListener(this);
        rowTwoColumnTwo.addActionListener(this);
        rowTwoColumnThree.addActionListener(this);
        rowThreeColumnOne.addActionListener(this);
        rowThreeColumnTwo.addActionListener(this);
        rowThreeColumnThree.addActionListener(this);
        
        
        buttonGridPanel.add(rowOneColumnOne);
        buttonGridPanel.add(rowOneColumnTwo);
        buttonGridPanel.add(rowOneColumnThree);
        buttonGridPanel.add(rowTwoColumnOne);
        buttonGridPanel.add(rowTwoColumnTwo);
        buttonGridPanel.add(rowTwoColumnThree);
        buttonGridPanel.add(rowThreeColumnOne);
        buttonGridPanel.add(rowThreeColumnTwo);
        buttonGridPanel.add(rowThreeColumnThree);
        
        menuBar = new JMenuBar();
        menu = new JMenu("Game Menu");
        
        menuBar.add(menu);
        
        newGame = new JMenuItem("New Game");
        newGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        menu.add(newGame);
        newGame.addActionListener(this);
        
        quitGame = new JMenuItem("Quit Game");
        quitGame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        menu.add(quitGame);
        quitGame.addActionListener(this);

        winsLabel = new JLabel("X wins: " + xWins + "  O wins: " + oWins + "  Ties: " + ties);
        
        guiWindow.add(menuBar);
        guiWindow.setJMenuBar(menuBar);
        guiWindow.add(winsLabel);
        guiWindow.add(buttonGridPanel);
        guiWindow.add(gameProgressLabel);
        
        guiWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == rowOneColumnOne) {
            currPlayer = player;
            playGame(0, 0);
            rowOneColumnOne.setText(currPlayer);
            rowOneColumnOne.setEnabled(false);
            if (currPlayer.equals("X")) {
                gameProgressLabel.setText("O's Turn");
            }
            else {
                gameProgressLabel.setText("X's Turn");
            }
            checkEndGame();
        }
        else if (event.getSource() == rowOneColumnTwo) {
            currPlayer = player;
            playGame(0, 1);
            rowOneColumnTwo.setText(currPlayer);
            rowOneColumnTwo.setEnabled(false);
            if (currPlayer.equals("X")) {
                gameProgressLabel.setText("O's Turn");
            }
            else {
                gameProgressLabel.setText("X's Turn");
            }
            checkEndGame();
        }
        else if (event.getSource() == rowOneColumnThree) {
            currPlayer = player;
            playGame(0, 2);
            rowOneColumnThree.setText(currPlayer);
            rowOneColumnThree.setEnabled(false);
            if (currPlayer.equals("X")) {
                gameProgressLabel.setText("O's Turn");
            }
            else {
                gameProgressLabel.setText("X's Turn");
            }
            checkEndGame();
        }
        else if (event.getSource() == rowTwoColumnOne) {
            currPlayer = player;
            playGame(1, 0);
            rowTwoColumnOne.setText(currPlayer);
            rowTwoColumnOne.setEnabled(false);
            if (currPlayer.equals("X")) {
                gameProgressLabel.setText("O's Turn");
            }
            else {
                gameProgressLabel.setText("X's Turn");
            }
            checkEndGame();
        }
        else if (event.getSource() == rowTwoColumnTwo) {
            currPlayer = player;
            playGame(1, 1);
            rowTwoColumnTwo.setText(currPlayer);
            rowTwoColumnTwo.setEnabled(false);
            if (currPlayer.equals("X")) {
                gameProgressLabel.setText("O's Turn");
            }
            else {
                gameProgressLabel.setText("X's Turn");
            }
            checkEndGame();
        }
        else if (event.getSource() == rowTwoColumnThree) {
            currPlayer = player;
            playGame(1, 2);
            rowTwoColumnThree.setText(currPlayer);
            rowTwoColumnThree.setEnabled(false);
            if (currPlayer.equals("X")) {
                gameProgressLabel.setText("O's Turn");
            }
            else {
                gameProgressLabel.setText("X's Turn");
            }
            checkEndGame();
        }
        else if (event.getSource() == rowThreeColumnOne) {
            currPlayer = player;
            playGame(2, 0);
            rowThreeColumnOne.setText(currPlayer);
            rowThreeColumnOne.setEnabled(false);
            if (currPlayer.equals("X")) {
                gameProgressLabel.setText("O's Turn");
            }
            else {
                gameProgressLabel.setText("X's Turn");
            }
            checkEndGame();
        }
        else if (event.getSource() == rowThreeColumnTwo) {
            currPlayer = player;
            playGame(2, 1);
            rowThreeColumnTwo.setText(currPlayer);
            rowThreeColumnTwo.setEnabled(false);
            if (currPlayer.equals("X")) {
                gameProgressLabel.setText("O's Turn");
            }
            else {
                gameProgressLabel.setText("X's Turn");
            }
            checkEndGame();
        }
        else if (event.getSource() == rowThreeColumnThree) {
            currPlayer = player;
            playGame(2, 2);
            rowThreeColumnThree.setText(currPlayer);
            rowThreeColumnThree.setEnabled(false);
            if (currPlayer.equals("X")) {
                gameProgressLabel.setText("O's Turn");
            }
            else {
                gameProgressLabel.setText("X's Turn");
            }
            checkEndGame();
        }
        else if (event.getSource() == newGame) {
            rowOneColumnOne.setEnabled(true);
            rowOneColumnTwo.setEnabled(true);
            rowOneColumnThree.setEnabled(true);
            rowTwoColumnOne.setEnabled(true);
            rowTwoColumnTwo.setEnabled(true);
            rowTwoColumnThree.setEnabled(true);
            rowThreeColumnOne.setEnabled(true);
            rowThreeColumnTwo.setEnabled(true);
            rowThreeColumnThree.setEnabled(true);
            
            rowOneColumnOne.setText("");
            rowOneColumnTwo.setText("");
            rowOneColumnThree.setText("");
            rowTwoColumnOne.setText("");
            rowTwoColumnTwo.setText("");
            rowTwoColumnThree.setText("");
            rowThreeColumnOne.setText("");
            rowThreeColumnTwo.setText("");
            rowThreeColumnThree.setText("");
            
            clearBoard();
        }
        else if (event.getSource() == quitGame) {
            guiWindow.dispose();
            System.exit(0);
        }
    }

    private void checkEndGame() {
        if (super.winner.equals(currPlayer)) {
            gameProgressLabel.setText(currPlayer + " Wins");
            if (currPlayer.equals("X")) {
                xWins ++;
                winsLabel.setText("X wins: " + xWins + "  O wins: " + oWins + "  Ties: " + ties);
            }
            else {
                oWins ++;
                winsLabel.setText("X wins: " + xWins + "  O wins: " + oWins + "  Ties: " + ties);
            }
            rowOneColumnOne.setEnabled(false);
            rowOneColumnTwo.setEnabled(false);
            rowOneColumnThree.setEnabled(false);
            rowTwoColumnOne.setEnabled(false);
            rowTwoColumnTwo.setEnabled(false);
            rowTwoColumnThree.setEnabled(false);
            rowThreeColumnOne.setEnabled(false);
            rowThreeColumnTwo.setEnabled(false);
            rowThreeColumnThree.setEnabled(false);
        }
        if (super.winner.equals("T")) {
            gameProgressLabel.setText("Game Over in a Tie");
            ties ++;
            winsLabel.setText("X wins: " + xWins + "  O wins: " + oWins + "  Ties: " + ties);
            rowOneColumnOne.setEnabled(false);
            rowOneColumnTwo.setEnabled(false);
            rowOneColumnThree.setEnabled(false);
            rowTwoColumnOne.setEnabled(false);
            rowTwoColumnTwo.setEnabled(false);
            rowTwoColumnThree.setEnabled(false);
            rowThreeColumnOne.setEnabled(false);
            rowThreeColumnTwo.setEnabled(false);
            rowThreeColumnThree.setEnabled(false);
        }
    }
}