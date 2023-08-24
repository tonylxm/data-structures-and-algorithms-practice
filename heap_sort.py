# DATE CREATED: 23/08/2023

# A is the heap, n is heap size, i is the largest node
def heapify(A, n, i):
    largest = i
    left = 2 * i + 1
    right = 2 * i + 2

    if right < n  and A[largest] < A[right]:
         largest = right

    if left < n and A[largest] < A[left]:
        largest = left
    
    if largest != i:
         A[i], A[largest] = A[largest], A[i]
         heapify(A, n, largest)


def heap_sort(A):
    n = len(A)
    for i in range (n//2 - 1, -1, -1):
          heapify(A, n, i)
    for i in range(n - 1, 0, -1):
         A[0], A[i] = A[i], A[0]
         heapify(A, i, 0)

def main():
    A = [5, -2, 7, 100, -52, 4, 7, 1, 3]
    heap_sort(A)
    print(A)

if __name__ == "__main__":
     main()