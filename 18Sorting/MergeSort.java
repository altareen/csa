public class MergeSort
{
    public static void mergeSort(int[] arr, int left, int right)
    {
        if (right == left)
        {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle+1, right);
        merge(arr, left, middle, right);
    }
    
    public static void merge(int arr[], int left, int middle, int right)
    {
        int tempArr[] = new int[right-left+1];
        int index1 = left;
        int index2 = middle+1;
        int indexTmp = 0;
        
        while (index1 <= middle && index2 <= right)
        {
            if (arr[index1] < arr[index2])
            {
                tempArr[indexTmp] = arr[index1];
                index1++;
            }
            else
            {
                tempArr[indexTmp] = arr[index2];
                index2++;
            }
            indexTmp++;
        }
        
        while (index1 <= middle)
        {
            tempArr[indexTmp] = arr[index1];
            index1++;
            indexTmp++;
        }
        
        while (index2 <= right)
        {
            tempArr[indexTmp] = arr[index2];
            index2++;
            indexTmp++;
        }
        
        for (int i = 0; i < tempArr.length; i++)
        {
            arr[left+i] = tempArr[i];
        }
    }
    
    public static void main(String[] args)
    {
        int[] scores = {64,21,33,70,12,85,44,3};
        mergeSort(scores, 0, scores.length-1);
        for (int item : scores)
        {
            System.out.print(item + " ");
        }
    }
}