def main():
    s = "12345654321"
    len_, i, flag = 0, 0, 0
    len_ = len(s)
    while i < len_/2:
        if s[i] != s[len_-1-i]:
            print("False\n")
            flag = 1
            break
        i = i+1
    if flag == 0:
        print("True\n")
    return 0
main()