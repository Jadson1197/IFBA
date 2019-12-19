#include <stdio.h>
#include <stdlib.h>
#include "dll.h"

int main()
{
    float num1 = 0.0;
    float num2 = 0.0;
    int op = 0;
    float res = 0.0;
    printf("Digite o primeiro numero!\n");
    scanf("%f",&num1);
    printf("Digite o segundo numero!\n");
    scanf("%f",&num2);
    printf("Digite a Operacao\n");
    printf("1 ---- Soma\n");
    printf("2 ---- Subtracao\n");
    printf("3 ---- Multiplicacao\n");
    printf("4 ---- Divisao\n");
    scanf("%d",&op);

    switch(op){
        case 1:
            res = soma(num1,num2);
            printf("O resultado e %f\n",res);
        break;
        case 2:
            res = sub(num1,num2);
            printf("O resultado e %f\n",res);
        break;
        case 3:
            res = mult(num1,num2);
            printf("O resultado e %f\n",res);
        break;
        case 4:
            res = divi(num1,num2);
            printf("O resultado e %f\n",res);
        break;
        default:
            printf("Opcao invalida\n");
    }
    system("pause");
    return 0;
}
