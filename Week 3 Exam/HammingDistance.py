def hamming(bin_1, bin_2):
    distance = 0
    for i in range(len(bin_1)):
        if bin_1[i] != bin_2[i]:
            distance += 1
    return distance


test_cases = int(input('Test cases : '))
for test in range(test_cases):
    x = int(input('X : '))
    y = int(input('Y : '))
    x = "{0:b}".format(x)
    y = "{0:b}".format(y)
    if len(x) == len(y):
        print(hamming(str(x), str(y)))
    elif len(x) > len(y):
        zeros = len(x) - len(y)
        y = '0' * zeros + y
        print(hamming(str(x), str(y)))
    else:
        zeros = len(y) - len(x)
        x = '0' * zeros + x
        print(hamming(str(x), str(y)))