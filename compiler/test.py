def main():
    toDec = [''] * 1000
    toDec = input()
    expr = [''] * 1000
    len_ = len(toDec)
    for i in range(0,  len_,  1):
        expr[i] = toDec[i]
    st_num = [0] * 1000
    st_op = [''] * 1000
    st_num_pt = -1
    st_op_pt = -1
    for i in range(len_-1, -1, -1):
        expr[i+1] = expr[i]
    expr[0] = '('
    expr[len_+1] = ')'
    len_ = len_+2
    i = len_-1
    num = 0
    k = 1
    while i >= 0:
        if expr[i] == '+':
            while st_op_pt >= 0 and ((st_op[st_op_pt] == '*') or (st_op[st_op_pt] == '/')):
                if st_op[st_op_pt] == '*':
                    st_num[st_num_pt-1] = st_num[st_num_pt]*st_num[st_num_pt-1]
                else:
                    st_num[st_num_pt-1] = st_num[st_num_pt]/st_num[st_num_pt-1]
                st_num_pt = st_num_pt-1
                st_op_pt = st_op_pt-1
            st_op_pt = st_op_pt+1
            st_op[st_op_pt] = '+'
            i = i-1
        elif expr[i] == '-':
            while st_op_pt >= 0 and ((st_op[st_op_pt] == '*') or (st_op[st_op_pt] == '/')):
                if st_op[st_op_pt] == '*':
                    st_num[st_num_pt-1] = st_num[st_num_pt]*st_num[st_num_pt-1]
                else:
                    st_num[st_num_pt-1] = st_num[st_num_pt]/st_num[st_num_pt-1]
                st_num_pt = st_num_pt-1
                st_op_pt = st_op_pt-1
            st_op_pt = st_op_pt+1
            st_op[st_op_pt] = '-'
            i = i-1
        elif expr[i] == '*':
            st_op_pt = st_op_pt+1
            st_op[st_op_pt] = '*'
            i = i-1
        elif expr[i] == '/':
            st_op_pt = st_op_pt+1
            st_op[st_op_pt] = '/'
            i = i-1
        elif expr[i] == ')':
            st_op_pt = st_op_pt+1
            st_op[st_op_pt] = ')'
            i = i-1
        elif expr[i] == '(':
            while st_op[st_op_pt] != ')':
                ch = st_op[st_op_pt]
                st_op_pt = st_op_pt-1
                if ch == '+':
                    st_num[st_num_pt-1] = st_num[st_num_pt]+st_num[st_num_pt-1]
                elif ch == '-':
                    st_num[st_num_pt-1] = st_num[st_num_pt]-st_num[st_num_pt-1]
                elif ch == '*':
                    st_num[st_num_pt-1] = st_num[st_num_pt]*st_num[st_num_pt-1]
                elif ch == '/':
                    st_num[st_num_pt-1] = st_num[st_num_pt]/st_num[st_num_pt-1]
                st_num_pt = st_num_pt-1
            st_op_pt = st_op_pt-1
            i = i-1
        else:
            num = 0
            k = 1
            while i >= 0 and expr[i] >= '0' and expr[i] <= '9':
                num = num+(float(expr[i])-float('0'))*k
                k = k*10
                i = i-1
            st_num_pt = st_num_pt+1
            st_num[st_num_pt] = num
    print("%d\n" % st_num[0])
    return 0
main()