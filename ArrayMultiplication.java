class ArrayMultiplication{
public static void main(String[] args){
int x[][] = {{7,8,9},{8,8,9},{9,9,7}};
int y[][] = {{7,8,9},{8,8,9},{9,9,7}};
int z[][] = new int[3][3];
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
z[i][j] = 0;
for(int k=0;k<3;k++)
{
z[i][j]+=x[i][k]*y[k][j];
}
System.out.print(z[i][j]+" ");
}
System.out.println();
}
System.out.println("All the best!");
}
}
