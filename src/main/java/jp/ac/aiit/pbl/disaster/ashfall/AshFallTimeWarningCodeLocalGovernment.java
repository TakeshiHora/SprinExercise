package jp.ac.aiit.pbl.disaster.ashfall;

import jp.ac.aiit.pbl.disaster.volcano.LocalGovernment;
/**
 * Class for calling construct to deal with Expected AshFall, Warning Code and Local Government as one set.
 */

public class AshFallTimeWarningCodeLocalGovernment {
        private int expectedAshFall;
        private WarningCode warningCode;
        private LocalGovernment localGovernment;

        AshFallTimeWarningCodeLocalGovernment(int expectedAshFall, int warningCodeId, int localGovernmentId) {
            this.expectedAshFall=expectedAshFall;
            this.warningCode = WarningCode.getById(warningCodeId);
            this.localGovernment = LocalGovernment.get(localGovernmentId);
        }

        public int getExpectedAshFall() {
            return expectedAshFall;
        }

        public WarningCode getWarningCode() {
            return warningCode;
        }

        public LocalGovernment getLocalGovernment() {
            return localGovernment;
        }

    @Override
    public String toString() {
        return "AshFallTimeWarningCodeLocalGovernment{" +
                "expectedAshFall=" + expectedAshFall +
                ", warningCode=" + warningCode +
                ", localGovernment=" + localGovernment +
                '}';
    }
}