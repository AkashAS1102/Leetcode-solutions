class Solution:
    def addDigits(self, num: int) -> int:
        while num >= 10:
            rev = 0
            while num > 0:
                r = num % 10
                rev = rev + r
                num = num // 10
            num = rev
        return num
        