package api.config;

import services.*;

public enum EntityConfiguration {

    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    CLIENT {
        @Override
        public Class<?> getEntityService() {
            return ClientService.class;
        }
    },
    PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProjectService.class;
        }
    },TASK {
        @Override
        public Class<?> getEntityService() {
            return TaskService.class;
        }
    },
    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }
    },
    ENTRIES {
        @Override
        public Class<?> getEntityService() {
            return TimeEntryService.class;
        }
    };


    public abstract Class<?> getEntityService();
}



