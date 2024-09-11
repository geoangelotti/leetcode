fn is_palindrome(x: i32) -> bool {
    todo!()
}
#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(121, true)]
    #[case(-121, false)]
    #[case(120, false)]
    fn test_is_palindrome(#[case] x: i32, #[case] expected: bool) {
        let result = is_palindrome(x);
        assert_eq!(result, expected);
    }
}
