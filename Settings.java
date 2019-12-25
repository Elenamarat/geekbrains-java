package lesson7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame {
    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 270;
    private final GameWindow gameWindow;
    private JRadioButton jrbHumVsAi;
    private JRadioButton jrbHumVsHum;
    private JSlider jsFieldSizeX;
    private JSlider jsFieldSizeY;
    private JSlider jsWinLength;
    private static final String FIELD_SIZE_X_PREFIX = "Field size X is: ";
    private static final String FIELD_SIZE_Y_PREFIX = "Field size Y is: ";
    private static final String WIN_LENGTH_PREFIX = "Winning length is: ";
    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final int MIN_WIN_LENGTH = 3;

    Settings(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Rectangle gameWindowBounds = gameWindow.getBounds();
        int posX = (int) gameWindowBounds.getCenterX() - WINDOW_WIDTH / 2;
        int posY = (int) gameWindowBounds.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(posX, posY);
        setResizable(false);
        setTitle("Creating a new game");
        setLayout(new GridLayout(15, 1));
        addGameModeControls();
        addFieldControls();
        JButton btnStartGame = new JButton("Start a game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onBtnStartGameClick();
            }
        });
        add(btnStartGame);
    }

    private void addGameModeControls() {
        add(new JLabel("Choose game mode"));
        jrbHumVsAi = new JRadioButton("Human vs. AI", true);
        jrbHumVsHum = new JRadioButton("Human vs. Human");
        ButtonGroup grpMode = new ButtonGroup();
        grpMode.add(jrbHumVsAi);
        grpMode.add(jrbHumVsHum);
        add(jrbHumVsAi);
        add(jrbHumVsHum);
    }

    private void addFieldControls() {
        JLabel jlFieldSizeX = new JLabel(FIELD_SIZE_X_PREFIX + MIN_FIELD_SIZE);
        JLabel jlFieldSizeY = new JLabel(FIELD_SIZE_Y_PREFIX + MIN_FIELD_SIZE);
        JLabel jlWinLength = new JLabel(WIN_LENGTH_PREFIX + MIN_WIN_LENGTH);
        jsFieldSizeX = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        jsFieldSizeY = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        jsWinLength = new JSlider(MIN_WIN_LENGTH, MIN_FIELD_SIZE, MIN_FIELD_SIZE);

        jsFieldSizeX.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = jsFieldSizeX.getValue();
                jlFieldSizeX.setText(FIELD_SIZE_X_PREFIX + currentValue);
                jsWinLength.setMaximum(currentValue);
            }
        });
        jsFieldSizeY.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = jsFieldSizeY.getValue();
                jlFieldSizeY.setText(FIELD_SIZE_Y_PREFIX + currentValue);
                jsWinLength.setMaximum(currentValue);
            }
        });
        jsWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jlWinLength.setText(WIN_LENGTH_PREFIX + jsWinLength.getValue());
            }
        });

        add(new JLabel("Choose field size"));
        add(jlFieldSizeX);
        add(jsFieldSizeX);
        add(jlFieldSizeY);
        add(jsFieldSizeY);
        add(new JLabel("Choose winning length"));
        add(jlWinLength);
        add(jsWinLength);
    }

    private void onBtnStartGameClick() {
        int gameMode;
        if (jrbHumVsHum.isSelected()) {
            gameMode = Map.MODE_HVH;
        } else if (jrbHumVsAi.isSelected()) {
            gameMode = Map.MODE_HVA;
        } else {
            throw new RuntimeException("Unknown game mode");
        }
        int fieldSizeX = jsFieldSizeX.getValue();
        int fieldSizeY = jsFieldSizeY.getValue();
        int winLength = jsWinLength.getValue();
        gameWindow.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLength);
        setVisible(false);
    }
}