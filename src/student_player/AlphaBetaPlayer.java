package student_player;

import hus.HusBoardState;
import hus.HusPlayer;
import hus.HusMove;

import student_player.mytools.AlphaBeta;
import student_player.mytools.MyTools;

/** A Hus player submitted by a student. */
public class AlphaBetaPlayer extends HusPlayer {

    /** You must modify this constructor to return your student number.
     * This is important, because this is what the code that runs the
     * competition uses to associate you with your agent.
     * The constructor should do nothing else. */
    public AlphaBetaPlayer() { super("Alpha-Beta"); }

    /** This is the primary method that you need to implement.
     * The ``board_state`` object contains the current state of the game,
     * which your agent can use to make decisions. See the class hus.RandomHusPlayer
     * for another example agent. */
    public HusMove chooseMove(HusBoardState gameState) {
        return AlphaBeta.getBestMoveAlphaBeta(gameState, player_id, 6);
    }
}
