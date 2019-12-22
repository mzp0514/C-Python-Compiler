class AVLNode:
    elem = 0
    is_null = 0
    height = 0
    left, right = 0, 0

class AVLTree:
    root = 0
    nodes = [AVLNode() for i in range(10000)]
    avai = 0

tree = AVLTree()
def max(a, b):
    if a > b:
        return a
    return b
def initTree():
    tree.avai = 1
    tree.root = 0
    for i in range(0,  10000, 1):
        tree.nodes[i].is_null = 1
        tree.nodes[i].height = 0
        tree.nodes[i].left = 0
        tree.nodes[i].right = 0
    return
def getHeight(node):
    ret = 0
    if tree.nodes[node].is_null == 0:
        ret = tree.nodes[node].height
        return ret
    ret = -1
    return ret
def leftLeftRotation(node):
    temp, p1, p2 = tree.nodes[node].left, 0, 0
    tree.nodes[node].left = tree.nodes[tree.nodes[node].left].right
    tree.nodes[temp].right = node
    param = 0
    param = tree.nodes[node].left
    p1 = getHeight(param)
    param = tree.nodes[node].right
    p2 = getHeight(param)
    tree.nodes[node].height = max(p1, p2)+1
    param = tree.nodes[temp].left
    p1 = getHeight(param)
    param = tree.nodes[temp].right
    p2 = getHeight(param)
    tree.nodes[temp].height = max(p1, p2)+1
    return temp
def rightRightRotation(node):
    temp, p1, p2 = tree.nodes[node].right, 0, 0
    tree.nodes[node].right = tree.nodes[tree.nodes[node].right].left
    tree.nodes[temp].left = node
    param = 0
    param = tree.nodes[node].left
    p1 = getHeight(param)
    param = tree.nodes[node].right
    p2 = getHeight(param)
    tree.nodes[node].height = max(p1, p2)+1
    param = tree.nodes[temp].left
    p1 = getHeight(param)
    param = tree.nodes[temp].right
    p2 = getHeight(param)
    tree.nodes[temp].height = max(p1, p2)+1
    return temp
def leftRightRotation(node):
    ret = 0
    param = tree.nodes[node].left
    tree.nodes[node].left = rightRightRotation(param)
    ret = leftLeftRotation(node)
    return ret
def rightLeftRotation(node):
    ret = 0
    param = tree.nodes[node].right
    tree.nodes[node].right = leftLeftRotation(param)
    ret = rightRightRotation(node)
    return ret
def insert(node, elem):
    param, p1, p2 = 0, 0, 0
    if tree.nodes[node].is_null != 0:
        i = tree.avai
        while tree.nodes[i].is_null == 0:
            i = i+1
        tree.nodes[i].is_null = 0
        tree.nodes[i].elem = elem
        tree.avai = i+1
        return i
    elif elem < tree.nodes[node].elem:
        param = tree.nodes[node].left
        tree.nodes[node].left = insert(param, elem)
        p1 = tree.nodes[tree.nodes[node].left].height
        p2 = tree.nodes[tree.nodes[node].right].height
        tree.nodes[node].height = max(p1, p2)+1
        p1 = tree.nodes[node].left
        p2 = tree.nodes[node].right
        if getHeight(p1)-getHeight(p2) == 2:
            if elem < tree.nodes[tree.nodes[node].left].elem:
                node = leftLeftRotation(node)
            else:
                node = leftRightRotation(node)
        return node
    elif elem > tree.nodes[node].elem:
        param = tree.nodes[node].right
        tree.nodes[node].right = insert(param, elem)
        p1 = tree.nodes[tree.nodes[node].left].height
        p2 = tree.nodes[tree.nodes[node].right].height
        tree.nodes[node].height = max(p1, p2)+1
        p1 = tree.nodes[node].left
        p2 = tree.nodes[node].right
        if getHeight(p1)-getHeight(p2) == -2:
            if elem > tree.nodes[tree.nodes[node].right].elem:
                node = rightRightRotation(node)
            else:
                node = rightLeftRotation(node)
        return node
    return 0
def addNode(elem):
    tree.root = insert(tree.root, elem)
    return
def search(node, elem):
    ret, p = 0, 0
    if tree.nodes[node].is_null != 0:
        return 0
    if elem == tree.nodes[node].elem:
        return node
    elif elem < tree.nodes[node].elem:
        p = tree.nodes[node].left
        ret = search(p, elem)
        return ret
    else:
        p = tree.nodes[node].right
        ret = search(p, elem)
        return ret
    return 0
def searchNode(elem):
    ret = 0
    ret = search(tree.root, elem)
    return ret
def removeNode(elem):
    return
def printNode(node):
    if tree.nodes[node].is_null != 0:
        print("NULL\n")
        return
    print("%d left child is " % tree.nodes[node].elem)
    if tree.nodes[tree.nodes[node].left].is_null != 0:
        print("NULL, right child is ")
    else:
        print("%d, right child is " % tree.nodes[tree.nodes[node].left].elem)
    if tree.nodes[tree.nodes[node].right].is_null != 0:
        print("NULL\n")
    else:
        print("%d\n" % tree.nodes[tree.nodes[node].right].elem)
    return
def printAVL(node):
    if tree.nodes[node].is_null != 0:
        return
    printNode(node)
    p = 0
    p = tree.nodes[node].left
    printAVL(p)
    p = tree.nodes[node].right
    printAVL(p)
    return
def main():
    n, i, p = 0, 0, 0
    initTree()
    comm = [0, 0, 0, 1, 2]
    elem = [4, 1, 5, 1, 5]
    for i in range(0,  5,  1):
        if comm[i] == 0:
            addNode(elem[i])
            printAVL(tree.root)
        elif comm == 1:
            removeNode(elem[i])
            printAVL(tree.root)
        elif comm == 2:
            p = searchNode(elem[i])
            printNode(p)
    return 0
main()