# DATE CREATED: 23/08/2023

# Time complexity of O(n^2)
def selection_sort(A):
    for i in range(0, len(A)-1):
        curr = i
        for j in range(i, len(A)):
            if A[j] < A[curr]:
                curr = j
        A[i], A[curr] = A[curr], A[i]        
        

def main():
    A = [4, 5, 2, 8, 9, 3]
    selection_sort(A)
    print(A)

if __name__ == "__main__":
     main()
    