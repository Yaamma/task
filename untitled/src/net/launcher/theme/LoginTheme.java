package src.net.launcher.theme;

import java.awt.Color;

import javax.swing.border.EmptyBorder;

import src.net.launcher.components.Align;
import src.net.launcher.components.ButtonStyle;
import src.net.launcher.components.CheckboxStyle;
import src.net.launcher.components.ComboboxStyle;
import src.net.launcher.components.ComponentStyle;
import src.net.launcher.components.DragbuttonStyle;
import src.net.launcher.components.DraggerStyle;
import src.net.launcher.components.LinklabelStyle;
import src.net.launcher.components.PassfieldStyle;
import src.net.launcher.components.ServerbarStyle;
import src.net.launcher.components.TextfieldStyle;

public class LoginTheme
{
        public static int		 frameW 	= 1027; 
	public static int		 frameH		= 685; 

	public static ButtonStyle	 toGame		= new ButtonStyle(568, 456, 105, 40, "font", "togame", 16F, Color.RED, true, Align.CENTER);
	public static ButtonStyle	 toPersonal     = new ButtonStyle(570, 436, 120, 40, "font", "button", 16F, Color.GREEN, true, Align.CENTER);
	public static ButtonStyle	 toOptions      = new ButtonStyle(8, 7, 25, 25, "font", "setting", 16F, Color.YELLOW, true, Align.CENTER);
	public static ButtonStyle	 toRegister     = new ButtonStyle(714, 476, 130, 40, "font", "button", 16F, Color.YELLOW, true, Align.CENTER);
	
	public static CheckboxStyle      savePass       = new CheckboxStyle(357, 409, 200, 23, "font", "checkbox", 16F, Color.WHITE, true);
	public static TextfieldStyle     login		= new TextfieldStyle(385, 325, 195+95, 36, "textfield", "login", 16F, Color.WHITE, Color.DARK_GRAY, new EmptyBorder(0, 10, 0, 10));
	public static PassfieldStyle     password	= new PassfieldStyle(385, 369+5, 195+95, 36, "textfield", "login", 22F, Color.WHITE, Color.DARK_GRAY, "-", new EmptyBorder(0, 10, 0, 10));
	
	public static ComponentStyle     newsBrowser    = new ComponentStyle(900, 900, 850, 369, "font", 16F, Color.WHITE, true);
	public static LinklabelStyle     links		= new LinklabelStyle(958, 651, 0, "font", 26F, Color.WHITE, Color.LIGHT_GRAY);

	public static DragbuttonStyle    dbuttons	= new DragbuttonStyle(959, 9, 35, 24, 992, 7, 35, 24, "draggbutton", true);
	public static DraggerStyle	 dragger	= new DraggerStyle(0, 0, frameW - 68, 38, "font", 16F, Color.WHITE, Align.LEFT);
	
	public static ButtonStyle	 update_yes	= new ButtonStyle(190, 370, 150, 40, "font", "button", 16F, Color.GREEN, true, Align.CENTER);
	public static ButtonStyle        update_no	= new ButtonStyle(515, 370, 150, 40, "font", "button", 16F, Color.RED, true, Align.CENTER);
	
	public static ComboboxStyle	 servers	= new ComboboxStyle(340, 458, 210, 40, "login", "combobox", 14F, Color.WHITE, true, Align.CENTER);
	public static ServerbarStyle     serverbar	= new ServerbarStyle(348, 501, 380, 16, "ubun", 16F, Color.WHITE, true);
	
	public static float              fontbasesize   = 16F;
	public static float              fonttitlesize  = 20F;
}