/* Game - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

public class Game extends Applet {

	private static final long serialVersionUID = 1L;
	public static Properties params = new Properties();
	public JFrame mainFrame;
	public static int version = 24;
	public JPanel mainPane = new JPanel();
	public static String mainurl = "world1.codeusa.net"; // im an ip
	public static int worldPort = 43594;
	public int lang = 0;
	public boolean Christmas = true;
	public static int cameraZoom = 850;
	public static int CameraPos1 = 0;
	public String frameName = "Codeusa Software";
	public JPanel totalPanel;

	public static boolean isWindows() {

		final String os = System.getProperty("os.name").toLowerCase();
		// windows
		return (os.indexOf("win") >= 0);

	}

	public static void main(final String[] strings) throws IOException {

		for (int i = 0; i < strings.length; i++) {
			if (strings[i].equalsIgnoreCase("servaddr")) {
				mainurl = strings[++i];
			}
		}

		final Game runclient = new Game();
		runclient.doFrame();

	}

	public Game() {
		try {
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void init() {

		doApplet();
	}

	void doApplet() {
		try {

			readVars();
			startClient();
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	public void doFrame() {
		try {
			/*
			 * if (isWindows()) { // for copying style JLabel label = new
			 * JLabel(); // for copying style JLabel label = new JLabel(); Font
			 * font = label.getFont();
			 *
			 * // create some css from the label's font StringBuffer style = new
			 * StringBuffer("font-family:" + font.getFamily() + ";");
			 * style.append("font-weight:" + (font.isBold() ? "bold" : "normal")
			 * + ";"); style.append("font-size:" + font.getSize() + "pt;");
			 *
			 * // html content JEditorPane ep = new JEditorPane("text/html",
			 * "<html><body style=\"" + style + "\">" +
			 * "We don't support running our client like this, please download the desktop version <a href=\"http://codeusa.net/download/\">here</a>"
			 * + "</body></html>");
			 *
			 * // handle link events ep.addHyperlinkListener(new
			 * HyperlinkListener() {
			 *
			 * @Override public void hyperlinkUpdate(HyperlinkEvent e) { if
			 * (e.getEventType().equals(HyperlinkEvent.EventType.ACTIVATED))
			 * PacketParser.openURL((e.getURL().toString())); // roll your own
			 * link launcher or use Desktop if J6+ } }); ep.setEditable(false);
			 * ep.setBackground(label.getBackground());
			 *
			 * // show JOptionPane.showMessageDialog(null, ep); return; }
			 */

			readVars();
			openFrame();
			startClient();
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	public void readVars() throws IOException {
		params.put("cabbase", "g.cab");
		params.put(
				"java_arguments",
				"-Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:+DisableExplicitGC -XX:+AggressiveOpts -XX:+UseAdaptiveGCBoundary -XX:MaxGCPauseMillis=500 -XX:SurvivorRatio=16 -XX:+UseParallelGC");
		params.put("colourid", "1");
		params.put("worldid", "1");
		params.put("lobbyid", "15");
		params.put("demoid", "0");
		params.put("demoaddress", "");
		params.put("modewhere", "0");
		params.put("modewhat", "0");
		params.put("lang", "0");
		params.put("objecttag", "0");
		params.put("js", "1");
		params.put("game", "0");
		params.put("affid", "0");
		params.put("advert", "1");
		params.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
		params.put("country", "0");
		params.put("haveie6", "0");
		params.put("havefirefox", "1");
		params.put("cookieprefix", "");
		params.put("cookiehost", ".codeusa.net");
		params.put("cachesubdirid", "0");
		params.put("crashurl", "http://codeusa.net");
		params.put("unsignedurl", "");
		params.put("sitesettings_member", "1");
		params.put("frombilling", "false");
		params.put("sskey", "");
		params.put("force64mb", "false");
		params.put("worldflags", "8");
		params.put("lobbyaddress", mainurl);
	}

	public void openFrame() throws ClassNotFoundException,
	InstantiationException, IllegalAccessException,
	UnsupportedLookAndFeelException {
		this.mainPane.setLayout(new BorderLayout());
		this.mainPane.add(this);

		this.mainPane.setPreferredSize(new Dimension(765, 503));
		this.totalPanel = new JPanel();
		this.totalPanel.setPreferredSize(new Dimension(765, 503));
		this.totalPanel.setLayout(new BorderLayout());
		this.totalPanel.add(this.mainPane, BorderLayout.CENTER);
		this.mainFrame = new JFrame(this.frameName);
		this.mainFrame.setLayout(new BorderLayout());
		this.mainFrame.getContentPane().add(this.totalPanel,
				BorderLayout.CENTER);
		this.mainFrame.setDefaultCloseOperation(3);
		this.mainFrame.pack();
		this.mainFrame.setLocationRelativeTo(null);
		this.mainFrame.setVisible(true);
	}

	// private static void startOver() {
	// try {
	// if (!me.getMood().isHappy) {
	// if (me.lovesHer && me.missesHer && me.cares) {
	// to.makeThingsRight(true);
	// } else {
	// me.stayStuck();
	// }
	// }
	// } catch (final Exception exception) {
	// System.out.println("Cannot get message across "
	// + " try again later. "
	// + "Void misses her too. Show her you care");
	// }
	// }
	public void startClient() {
		try {
			// RuntimeLoader loader = new RuntimeLoader();
			// Class clientclass = loader.loadClass("client");

			// Applet clientApplet = (Applet) clientclass.newInstance();
			// clientclass.getMethod("provideLoaderApplet",
			// new Class[] { java.applet.Applet.class }).invoke(null,
			// new Object[] { this });
			// clientApplet.init();
			// clientApplet.start();
			Applet_Sub1.provideLoaderApplet(this);
			final client var_client = new client();
			var_client.init();
			var_client.start();
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public String getParameter(final String string) {
		return (String) params.get(string);
	}

	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	@Override
	public URL getCodeBase() {
		URL url;
		try {
			url = new URL(new StringBuilder().append("http://").append(mainurl)
					.toString());
		} catch (final Exception exception) {
			exception.printStackTrace();
			return null;
		}
		return url;
	}

}
