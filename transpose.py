class Solution:
    def transpose(self, matrix):
        rows = len(matrix)
        cols = len(matrix[0])
        ans = []
        for j in range(cols):
            temp = []
            for i in range(rows):
                temp.append(matrix[i][j])
            ans.append(temp)
        return ans
