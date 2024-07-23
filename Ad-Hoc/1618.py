n = int(input())

for i in range(0, n):
    ax, ay, bx, by, cx, cy, dx, dy, rx, ry = map(int, input().split())
    dentro = (rx >= ax) & (rx <= bx) & (ry >= ay) & (ry <= dy)
    print(int(dentro))