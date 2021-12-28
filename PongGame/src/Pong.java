import javax.swing.JFrame;

public class Pong extends JFrame {
	
	// GLOBAL VARIABLES
	private final static String WINDOW_TITLE = "Pong";
	private final static int WINDOW_WIDTH = 800;
	private final static int WINDOW_HEIGHT = 600;

	// PONG CONSTRUCTOR
	public Pong() {
		setTitle(WINDOW_TITLE); // Windows Title Bar
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Window width x height
		setResizable(false); // User resizable window
		add(new PongPanel());
		setVisible(true); // Display window
		setDefaultCloseOperation(EXIT_ON_CLOSE); // User clicks the close option
	}
	
	// MAIN METHOD
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Pong (); // Initialise new Pong object
			}
		});
	}
}
