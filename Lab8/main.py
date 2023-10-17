import os

class Lab7:
    @staticmethod
    def main():
        nRows = 0
        h = 0
        bridge = 0
        filler = ''
        check = True

        print("Input odd number(>=3), which will be responsible for the size of the matrix: ")
        while check:
            try:
                nRows = int(input().strip())
                if nRows < 3 or nRows % 2 == 0:
                    print("Your number is incorrect, please try again")
                else:
                    check = False
            except ValueError:
                print("Invalid input. Please try again.")

        h = nRows - 1
        nRows -= 1
        arr = [['' for _ in range(h)] for _ in range(nRows)]
        for i in range(nRows):
            arr[i] = ['' for _ in range(h)]
            if i < nRows // 2:
                h -= 2
                if i == (nRows // 2) - 1:
                    h = 2
            elif i == nRows // 2:
                h = 2
            else:
                h += 2
                arr[i] = ['' for _ in range(h)]

        print("Input filler symbol: ")
        while not filler:
            filler = input().strip()
            if len(filler) != 1:
                if len(filler) == 0:
                    print("No symbol found")
                    os._exit(0)
                else:
                    print("Too much symbols")
                    os._exit(0)

        with open("Lab7.txt", "w") as fOut:
            for i in range(nRows):
                for j in range(arr[i].__len__() // 2):
                    if (i < nRows // 2):
                        arr[i][j] = " "
                    else:
                        arr[i][j] = filler
                    print(arr[i][j] + " ", end="")
                    fOut.write(arr[i][j] + " ")
                    bridge = j
                for a in range((nRows + 1) - arr[i].__len__()):
                    print("  ", end="")
                    fOut.write("  ")
                for j in range(bridge + 1, arr[i].__len__()):
                    if (i > nRows // 2 - 1):
                        arr[i][j] = " "
                    else:
                        arr[i][j] = filler
                    print(arr[i][j] + " ", end="")
                    fOut.write(arr[i][j] + " ")
                if i == (nRows // 2) - 1:
                    print()
                    fOut.write("\n")
                print()
                fOut.write("\n")


if __name__ == '__main__':
    Lab7.main()
