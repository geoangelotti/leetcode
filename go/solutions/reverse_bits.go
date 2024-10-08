package solutions

func ReverseBits(num uint32) uint32 {
	var res uint32
	for i := 0; i < 32; i++ {
		res <<= 1
		res = res | (num & 1)
		num >>= 1
	}
	return res
}
