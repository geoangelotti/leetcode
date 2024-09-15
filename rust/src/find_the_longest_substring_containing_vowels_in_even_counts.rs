fn find_the_longest_substring(s: String) -> i32 {
    todo!()
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
