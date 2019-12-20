int func(int a, int b){
    int len = strlen(a);
    for(int i = 0; i < strlen(a); ++i){
        a = 1;
        printf("a");
        printf("%d", strlen(a));
    }

    for(int i = 100; i > 0; i--){
        int a[10000], b = 1, c;
        a[0] = a[1];
        a[0] = a[2] * a[3];
        a[7] = a[2] / a[2] + a[0];
        for(int i = 100; i > 0; i = i + 2){
        
        }
    }

    for(int i = 100; i > 0; i = i + 2){
        
    }
    return strlen(b)*2;
}

int main(){
    int a = 0, b = 1;
    printf("%d", func(a, b*a));
    return 0;
}