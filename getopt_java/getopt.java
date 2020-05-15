package getopt_java;
// Imports
import java.util.HashMap;
import java.util.ArrayList;



public class getopt {
	// the args passed in from the other class
	private String[] raw_arguments;

	private ArrayList<Argument> processed_arguments; 

	private String[] long_arguments;
	private String single_char_arguments;
	

	/**
	 * Create the object with the full array from the command line
	 */
	public getopt(String[] raw_arguments) {
		this.raw_arguments = raw_arguments;
	}


	/**
	 * Sets up regular, single letter options
	 * @Param String raw_options a string containing all single character options. If char followed by : then needs argument.
	 */
	public void set_regular_options(String single_char_arguments) {
		this.single_char_arguments = single_char_arguments;
	}

	/**
	 * for setting long arguments or GNU style arguments.
	 * flags with last char ':' require an arguments
	 * @Param String[] list of long arguments
	 */
	public void set_long_options(String[] long_arguments){
		this.long_arguments = long_arguments;
	}

	/**
	 * the point of this private class is to have a quick data structure to read information into dynamically.
	 * it can then be returned in a fixed size string[] to be processed
	 */
	private class Argument {
		// Class variables
		private String argument_char;
		private String argument_value;
		private boolean has_value;

		private Argument (String argument_char, String argument_value, boolean has_value) {
			this.argument_char = argument_char;
			this.has_value = has_value;
			// no need to fill this with anything if doesn't have
			this.argument_value = has_value ? argument_value : null;
		} // end ctor

		private String[] get_args() {
			if (this.has_value) {
				String[] return_arr = {this.argument_char, "true", this.argument_value};
				return return_arr;
			} else {
				String[] return_arr = {this.argument_char, "false"};
				return return_arr;
			}
		}
	}// end argument class

} // end getopt class
