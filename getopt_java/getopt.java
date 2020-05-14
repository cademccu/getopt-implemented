package getopt_java;

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


} // end getopt class
