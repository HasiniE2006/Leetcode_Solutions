class Solution:
    def shortestCompletingWord(self, licensePlate, words):
        need = [0] * 26
        for ch in licensePlate:
            if ch.isalpha():
                ch = ch.lower()
                need[ord(ch) - ord('a')] += 1
        ans = ""
        for word in words:
            have = [0] * 26
            for ch in word:
                have[ord(ch) - ord('a')] += 1
            ok = True
            for i in range(26):
                if have[i] < need[i]:
                    ok = False
                    break
            if ok:
                if ans == "" or len(word) < len(ans):
                    ans = word
        return ans
