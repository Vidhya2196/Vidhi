int mystrlen(char *s)
{
    char s[]=”program”;
    int counter = 0 ;
    int i;
    for (i = 0; i < s[i]!= 0; i++)
    { 
    	counter++;
    }

    printf( "The number of characters is %d", counter);

    return 0;
