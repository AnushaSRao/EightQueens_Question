public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		if((square/8)%2==1 && square%2==0) {
			return true;
		}
		else if((square/8)%2==0 && square%2==1)
			return true;
		return false;
	}
}
