from collections import Counter
class Solution:
    def hasGroupsSizeX(self, deck):
        count = Counter(deck)
        def gcd(a, b):
            while b != 0:
                a, b = b, a % b
            return a
        g = 0
        for value in count.values():
            g = gcd(g, value)
        return g >= 2
