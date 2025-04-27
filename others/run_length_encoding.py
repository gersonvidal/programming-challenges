def run_length_encoding(test_string):
    # we will assume test_string will always be correct
    result = []
    
    current_letter = test_string[0]
    count = 1
    
    for character in test_string[1:]:
        if character == current_letter:
            count += 1
        else:
            result.append((current_letter, count))
            current_letter = character
            count = 1

    result.append((current_letter, count)) # last sequence
    
    return result

test_string = "aaaaaaaaaabbbbbbbbbbcccccccccc"
print(run_length_encoding(test_string)) 