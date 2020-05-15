package getopt_java;
// Imports
import java.util.HashMap;
import java.util.ArrayList;



public class getopt {

	private String[] raw_arguments;
	

	/**
	 * This sets up and does all the argument getting.
	 * everything else is accessible via getters.
	 */
	public getopt(String[] raw_arguments) {
		this.raw_arguments = raw_arguments;
	}

	/**
	 * Sets up regular, single letter options
	 * @Param String raw_options a string containing all single character options. If char followed by : then needs argument.
	 */
	protected void set_regular_options(String raw_options) {
		System.out.println(raw_arguments.length);
	}


	private class Argument {
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
	}

} // end getopt class
