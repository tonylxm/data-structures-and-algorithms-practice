# DATE CREATED: 23/08/2023

# Time complexity of O(n^2)
# But very fast if array is almost sorted
def insertion_sort(A):
    for i in range(1, len(A)):
        insert_after = i - 1
        curr_val = A[i]
        while insert_after >= 0 and A[insert_after] > curr_val:
                A[insert_after + 1] = A[insert_after]
                insert_after -= 1
        A[insert_after + 1] = curr_val

def main():
    A = [4, 5, 2, 8, 9, 3]
    insertion_sort(A)
    print(A)

if __name__ == "__main__":
     main()