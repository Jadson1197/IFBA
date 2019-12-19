#ifndef DLL_H_INCLUDED
    #define DLL_H_INCLUDED
    #define MINHADLL __declspec(dllexport)
#else
    #define MINHADLL __declspec(dllimport)
#endif

MINHADLL float soma(float num1,float num2);
MINHADLL float sub(float num1,float num2);
MINHADLL float mult(float num1,float num2);
MINHADLL float divi(float num1,float num2);
