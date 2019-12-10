import getopt
import sys

output_filename = 'default.out'


# prints your output for --help or -h
def help_output():
    print("[ USAGE ]")
    print("your help options here")

# these options are single char options (e.g. -o, -v)
# if followed by :, they need argument
regular_options = "o:xh"
# multi char gnu options, ex "--verbose"
# in list form, "if --help=" then it requires an argument
GNU_options = ['help', 'options=']

# cant any erroneous options 
try:
    # setting options to
    options, remainder = getopt.getopt(sys.argv[1:], regular_options, GNU_options)

except getopt.error as err:
    #output error and exit
    print (str(err))
    sys.exit(1)


# set defaults
output = "default"
options_value = "default option"
# set options without args
x_flag = False


for opt in options:
    if opt[0] == '-o':
        output = options[1]
    elif opt[0] == '-x':
        x_flag = True
    elif opt[0] in ('--help', '-h'):
        help_output()
        sys.exit(0)
    elif opt[0] == '--options':
        options_value = opt[1]


print(output)
print(options_value)
print(x_flag)


