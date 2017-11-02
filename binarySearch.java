class BinarySearch {

    public static void main(String[] args){
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};

        int element = 10;
        int index = binarySearch(array, element);
        System.out.println(index);
    }

    public static int binarySearch(int[] array, int element){
        int i = 0;
        int j = array.length;
        int location;

        while(i < j){
            int middle = (i + j)/2;
            if(element > array[middle]){
                i = middle + 1;
            }
            else{
                j = middle;
            }
        }

        if(element == array[i]) {
            location = i;
        }
        else{
            location = 0;
        }

        return location;
    }
}
