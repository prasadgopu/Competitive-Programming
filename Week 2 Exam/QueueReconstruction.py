def Reconstruction(list1):
    list1=sorted(list1)
    list1.reverse()
    for i in range(len(list1)-1):
        if(list1[i][0]==list1[i+1][0]):
            if(list1[i][1]>list1[i+1][1]):
                list1[i],list1[i+1]=list1[i+1],list1[i]

    result = []
    for item in list1:
        result.insert(item[1], item)
    return result
    pass

print(Reconstruction([[7,0],[4,4], [7,1], [5,0], [6,1], [5,2]]))
print(Reconstruction([[12,0],[6,3],[3,4],[9,2], [11,1],[1,5]]))
print(Reconstruction([ [2,4],[5,1], [3,3], [1,5], [4,2], [6,0]]))