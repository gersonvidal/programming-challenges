from itertools import groupby

def run_length_encoding_itertools(test_string):
    return [(character, sum(1 for _ in generator)) for character, generator in groupby(test_string)]

test_string = "aaaabbbcca"
print(run_length_encoding_itertools(test_string))

# ---------------------------------

# from itertools import groupby; run_length_encoding_one_line = lambda test_string: [(character, sum(1 for _ in generator)) for character, generator in groupby(test_string)]
# print(run_length_encoding_one_line("aaaabbbcca"))