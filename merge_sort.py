# DATE CREATED: 23/08/2023

# Time complexity of O(n log n)
def merge_sort(A, start, end):
    if (start == end): return

    mid = start + (end - start) // 2
    merge_sort(A, start, mid)
    merge_sort(A, mid + 1, end)
    combined_sorted(A, start, mid, end)

def combined_sorted(A, start, mid, end):
    B = [0] * (end - start + 1)
    p1 = start
    p2 = mid + 1

    for i in range(0, end - start + 1):
        # 2nd array is empty
        if p1 > mid: 
            B[i] = A[p2]
            p2 += 1
        # 1st array is empty
        elif p2 > end:
            B[i] = A[p1]
            p1 += 1
        
        elif (A[p1] <= A[p2]):
            B[i] = A[p1]
            p1 += 1
        else:
            B[i] = A[p2]
            p2 += 1
    
    for i in range(start, end + 1):
        A[i] = B[i - start]

def main():
    A = [5, -2, 7, 100, -52, 4, 7, 1, 3]
    merge_sort(A, 0, len(A) - 1)
    print(A)

if __name__ == "__main__":
     main()

 