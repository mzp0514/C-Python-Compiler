#include <stdio.h>

struct AVLNode{
	int elem;
	int is_null;
	int height;
	int left, right;
};

struct AVLTree{
	int root;

	struct AVLNode nodes[10000];
	int avai;
};

struct AVLTree tree;

int max(int a, int b){
	if(a > b) {
		return a;
	}
	return b;
}

void initTree(){
	tree.avai = 1;
	tree.root = 0;
	for(int i = 0; i < 10000; i=i+1){
		tree.nodes[i].is_null = 1;
		tree.nodes[i].height = 0;
		tree.nodes[i].left = 0;
		tree.nodes[i].right = 0;
	}
	return;
}

int getHeight(int node){
	int ret;
	if (tree.nodes[node].is_null == 0) {
		ret = tree.nodes[node].height;
		return ret;
	}
	ret = -1;
	return ret;
}

int leftLeftRotation(int node){
	int temp = tree.nodes[node].left, p1, p2;
	tree.nodes[node].left = tree.nodes[tree.nodes[node].left].right;
	tree.nodes[temp].right = node;

	int param;
	param = tree.nodes[node].left;
	p1 = getHeight(param);
	param = tree.nodes[node].right;
	p2 = getHeight(param);
	tree.nodes[node].height = max(p1, p2) + 1;
	param = tree.nodes[temp].left;
	p1 = getHeight(param);
	param = tree.nodes[temp].right;
	p2 = getHeight(param);
	tree.nodes[temp].height = max(p1, p2) + 1;
	return temp;
}

int rightRightRotation(int node){
	int temp = tree.nodes[node].right, p1, p2;
	tree.nodes[node].right = tree.nodes[tree.nodes[node].right].left;
	tree.nodes[temp].left = node;

	int param;
	param = tree.nodes[node].left;
	p1 = getHeight(param);
	param = tree.nodes[node].right;
	p2 = getHeight(param);
	tree.nodes[node].height = max(p1, p2) + 1;
	param = tree.nodes[temp].left;
	p1 = getHeight(param);
	param = tree.nodes[temp].right;
	p2 = getHeight(param);
	tree.nodes[temp].height = max(p1, p2) + 1;
	return temp;
}

int leftRightRotation(int node){
	int ret;
	int param = tree.nodes[node].left;
	tree.nodes[node].left = rightRightRotation(param);
	ret = leftLeftRotation(node);
	return ret;
}

int rightLeftRotation(int node){
	int ret;
	int param = tree.nodes[node].right;
	tree.nodes[node].right = leftLeftRotation(param);
	ret = rightRightRotation(node);
	return ret;
}

int insert(int node, int elem){
	int param, p1, p2;
	if(tree.nodes[node].is_null != 0){
		int i = tree.avai;
		while(tree.nodes[i].is_null == 0) {i = i + 1;}
		tree.nodes[i].is_null = 0;
		tree.nodes[i].elem = elem;
		tree.avai = i + 1;
		return i;
	}else if(elem < tree.nodes[node].elem){
		param = tree.nodes[node].left;
		tree.nodes[node].left = insert(param, elem);
		p1 = tree.nodes[tree.nodes[node].left].height;
		p2 = tree.nodes[tree.nodes[node].right].height;
		tree.nodes[node].height = max(p1, p2) + 1;
		p1 = tree.nodes[node].left;
		p2 = tree.nodes[node].right;
		if (getHeight(p1) - getHeight(p2) == 2){
			if (elem < tree.nodes[tree.nodes[node].left].elem) {
				node = leftLeftRotation(node);
			}
			else {
				node = leftRightRotation(node);
			}
		}
		return node;
	}else if(elem > tree.nodes[node].elem){
		param = tree.nodes[node].right;
		tree.nodes[node].right = insert(param, elem);
		p1 = tree.nodes[tree.nodes[node].left].height;
		p2 = tree.nodes[tree.nodes[node].right].height;
		tree.nodes[node].height = max(p1, p2) + 1;
		p1 = tree.nodes[node].left;
		p2 = tree.nodes[node].right;
		if (getHeight(p1) - getHeight(p2) == -2){
			if (elem > tree.nodes[tree.nodes[node].right].elem) {
				node = rightRightRotation(node);
			}
			else {
				node = rightLeftRotation(node);
			}
		}
		return node;
	}
	return 0;
}

void addNode(int elem){
	tree.root = insert(tree.root, elem);
	return;
}

int search(int node, int elem){
	int ret, p;
	if(tree.nodes[node].is_null != 0) {
		return 0;
	}
	if(elem == tree.nodes[node].elem) {
		return node;
	}
	else if(elem < tree.nodes[node].elem) {
		p = tree.nodes[node].left;
		ret = search(p, elem);
		return ret;
	}
	else {
		p = tree.nodes[node].right;
		ret = search(p, elem);
		return ret;
	}
	return 0;
}

int searchNode(int elem){
	int ret;
	ret = search(tree.root, elem);
	return ret;
}



void removeNode(int elem){
	return;
}

void printNode(int node){
	if(tree.nodes[node].is_null != 0){
		printf("NULL\n");
		return;
	}
	printf("%d left child is ", tree.nodes[node].elem);
	if(tree.nodes[tree.nodes[node].left].is_null != 0) {
		printf("NULL, right child is ");
	}
	else {
		printf("%d, right child is ", tree.nodes[tree.nodes[node].left].elem);
	}

	if(tree.nodes[tree.nodes[node].right].is_null != 0) {
		printf("NULL\n");
	}
	else{
		printf("%d\n", tree.nodes[tree.nodes[node].right].elem);
	}
	return;
}

void printAVL(int node){
	if(tree.nodes[node].is_null != 0) {
		return;
	}
	printNode(node);
	int p;
	p = tree.nodes[node].left;
    printAVL(p);
    p = tree.nodes[node].right;
    printAVL(p);
    return;
}

int main(){
	int n, i, p;
	initTree();
	int comm[5] = {0, 0, 0, 1, 2};
	int elem[5] = {4, 1, 5, 1, 5};
	for (int i=0; i<5; i++){
		if(comm[i] == 0){
			addNode(elem[i]);
			printAVL(tree.root);
		}
		else if(comm == 1){
			removeNode(elem[i]);
			printAVL(tree.root);
		}
		else if(comm == 2) {
			p = searchNode(elem[i]);
			printNode(p);
		}
		
	}
	return 0;
}
