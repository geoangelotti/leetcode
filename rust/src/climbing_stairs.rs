pub fn climb_stairs(n: i32) -> i32 {
    todo!()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(2, 2)]
    #[case(3, 3)]
    fn test_climb_stairs(#[case] n: i32, #[case] expected: i32) {
        let result = climb_stairs(n);
        assert_eq!(result, expected)
    }
}
