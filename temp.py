def insertionSort(A):
    n = len(A)
    for i in range(1, n-1):
        curr_val = A[i]
        insert_pos = i - 1
        while (insert_pos >= 0 and A[insert_pos] < curr_val):
            A[insert_pos+1] = A[insert_pos]
            insert_pos -= 1
        A[insert_pos+1] = curr_val