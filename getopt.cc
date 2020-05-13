#include <iostream>
#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>
using namespace std;


// basic implementation of getopt for future use //

int main(int argc, char* argv[]) {

	// set any flags or defautls
	bool x_flag = false, y_flag = false, r_flag = false;

	// set any defaults
	string run_speed = "default";

	// args necessary for running
	int opt;
	extern char *optarg;
	extern int optind;

	// the actual options you include
	char my_options[] = "+:r:xy";


	// WHILE loop, loops over args and sets as necessary
	while((opt = getopt(argc, argv, my_options)) != -1) {
		// switch statement runs on options of char, represented by ints
		switch(opt) {
			case 'r':
				if (r_flag) {
					// occured more than once
					cerr << "-r was used more than once.\n";
					return 1;
				}// end if chck
				r_flag = true;
				run_speed =  optarg; // set flag
				break;

			case 'x':
				x_flag = true;
				break;

			case 'y':
				y_flag = true;
				break;
			default:
				break;
		} // end switch on opt
	} // end while

	cout << boolalpha << x_flag << "\n";
	cout << y_flag << "\n";
	cout << r_flag << "\n";
	cout << "run_speed value: " << run_speed << "\n";

} // end main
