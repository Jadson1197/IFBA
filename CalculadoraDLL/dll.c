#include <stdio.h>
#include "dll.h"

MINHADLL float soma(float num1,float num2){
    float result = num1 + num2;
    return result;
}

MINHADLL float sub(float num1,float num2){
    float result = num1 - num2;
    return result;
}

MINHADLL float mult(float num1,float num2){
    float result = num1 * num2;
    return result;
}

MINHADLL float divi(float num1,float num2){
    float result = num1 / num2;
    return result;
}
