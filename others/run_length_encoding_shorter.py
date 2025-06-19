# def run_length_encoding(test_string):
      # we will assume test_string will always be correct
#     result = []
    
#     current_letter = test_string[0]
#     count = 1
    
#     for character in test_string[1:]:
#         if character == current_letter:
#             count += 1
#         else:
#             result.append((current_letter, count))
#             current_letter = character
#             count = 1

#     result.append((current_letter, count)) # last sequence
    
#     return result

def run_length_encoding_shorter(test_string):
    result, current_letter, count = [], test_string[0], 1
    for character in test_string[1:]: result.append((current_letter, count)) if character != current_letter else None; count = 1 if character != current_letter else count + 1; current_letter = character if character != current_letter else current_letter
    result.append((current_letter, count)); return result

test_string = "aaaabbbcca"
print(run_length_encoding_shorter(test_string))    