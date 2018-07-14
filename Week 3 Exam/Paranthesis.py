global final_list
def findcombinations(temp_list, position, n, open_bracket, close_bracket):
    if close_bracket==n:
        s=''
        for i in range(len(temp_list)):
            s+=temp_list[i]
        final_list.append(s)
        return
    else:
        if open_bracket > close_bracket :
            temp_list[position]='}'
            findcombinations(temp_list,position+1,n,open_bracket,close_bracket+1)
        if open_bracket <n:
            temp_list[position]='{'
            findcombinations(temp_list,position+1,n,open_bracket+1,close_bracket)


def parenthisis(n):
    global final_list
    final_list=[]
    list=[None]*(2*n)
    findcombinations(list,0,n,0,0)
    print (final_list,len(final_list))
    pass

parenthisis(2)
parenthisis(3)
parenthisis(5)
parenthisis(4)
parenthisis(1)
parenthisis(6)
