fn find_the_longest_substring(s: String) -> i32 {
    let vowels = [b'a', b'e', b'i', b'o', b'u'];
    let mut prv = [i32::MAX; 1 << 5];
    let (mut ans, mut mask) = (0, 0);
    for (i, c) in (0_i32..).zip(s.bytes()) {
        prv[mask] = prv[mask].min(i);
        if let Ok(idx) = vowels.binary_search(&c) {
            mask ^= 1 << idx;
        }
        ans = ans.max((i + 1).saturating_sub(prv[mask]));
    }
    ans
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case("eleetminicoworoep", 13)]
    #[case("leetcodeisgreat", 5)]
    #[case("bcbcbc", 6)]
    fn test_find_the_longest_substring(#[case] s: String, #[case] expected: i32) {
        let result = find_the_longest_substring(s);
        assert_eq!(result, expected);
    }
}
